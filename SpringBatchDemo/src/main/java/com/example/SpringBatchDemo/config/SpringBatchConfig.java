package com.example.SpringBatchDemo.config;

import com.example.SpringBatchDemo.Repository.PersonRepository;
import com.example.SpringBatchDemo.model.Person;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {

    @Autowired
    private PersonRepository personRepository;
    
    @Bean
    public Job job(JobRepository jobRepository, Step step){
        return new JobBuilder("importPersons",jobRepository)
                .start(step)
                .build();
    }
    
    @Bean
    public Step step(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager){

        return new StepBuilder("csv-import-step",jobRepository)
                .<Person,Person> chunk(10,platformTransactionManager)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
        
    }

    @Bean
    RepositoryItemWriter<Person> writer() {
        System.out.println(personRepository);
        RepositoryItemWriter<Person> personRepositoryItemWriter = new RepositoryItemWriter<>();
        personRepositoryItemWriter.setRepository(personRepository);
        personRepositoryItemWriter.setMethodName("save");
        return personRepositoryItemWriter;
    }

    @Bean
    PersonProcessor processor() {
        System.out.println("Akisjd");
        return new PersonProcessor();
    }

     FlatFileItemReader<Person> reader() {
        System.out.println("Arya ");
        return new FlatFileItemReaderBuilder<Person>().name("personItemReader")
                .resource(new ClassPathResource("people-1000.csv"))
                .linesToSkip(1)
                .lineMapper(lineMapper())
                .targetType(Person.class)
                .build();

    }

    private LineMapper<Person> lineMapper() {

        DefaultLineMapper<Person> lineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        delimitedLineTokenizer.setDelimiter(",");
        delimitedLineTokenizer.setStrict(false);
        delimitedLineTokenizer.setNames("id","userId","firstName","lastName","gender","email","phone","dateOfBirth","jobTitle");

        BeanWrapperFieldSetMapper<Person> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(Person.class);

        lineMapper.setLineTokenizer(delimitedLineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);

        return lineMapper;
    }
}

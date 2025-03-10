package com.batch2.springbatch.config;

import com.batch2.springbatch.model.Customer;
import com.batch2.springbatch.repository.CustomerRepository;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

     @Autowired
    private CustomerRepository customerRepository;

     @Bean
    public FlatFileItemReader<Customer> reader(){
         FlatFileItemReader<Customer> fileItemReader = new FlatFileItemReader<>();
         fileItemReader.setResource(new FileSystemResource("src/main/resources/customers.csv"));
         fileItemReader.setName("csvReader");
         fileItemReader.setLinesToSkip(1);
         fileItemReader.setLineMapper(linemapper());

         return fileItemReader;
     }

    private LineMapper<Customer> linemapper() {

        DefaultLineMapper<Customer> defaultLineMapper = new DefaultLineMapper<>();

        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setDelimiter(",");
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames("id", "firstName", "lastName", "email");

        BeanWrapperFieldSetMapper<Customer> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(Customer.class);
        defaultLineMapper.setLineTokenizer(lineTokenizer);
        defaultLineMapper.setFieldSetMapper(fieldSetMapper);
        return defaultLineMapper;
    }

    @Bean
    public CustomerProcessor processor(){
         return new CustomerProcessor();
    }

    @Bean
    public RepositoryItemWriter<Customer> writer(){
         RepositoryItemWriter<Customer> writer = new RepositoryItemWriter<>();
         writer.setRepository(customerRepository);
         writer.setMethodName("save");
         return writer;
    }

    @Bean
    public Step step1(){
         return stepBuilderFactory
                 .get("csv-import")
                 .<Customer,Customer>chunk(10)
                 .reader(reader())
                 .processor(processor())
                 .writer(writer())
                 .build();
    }

    @Bean
    public Job job(){
         return jobBuilderFactory
                 .get("importCustomers")
                 .flow(step1())
                 .end()
                 .build();

    }

/*    @Bean
    public JobRepository jobRepository(DataSource dataSource, PlatformTransactionManager transactionManager) throws Exception {
        JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
        factory.setDataSource(dataSource);
        factory.setTransactionManager(transactionManager);
        factory.setDatabaseType("MYSQL");  // Set to MYSQL for MySQL DB
        return factory.getObject();
    }*/

}
package com.arya;

public class BuilderDesignPattern {

    private String name;
    private String address;
    private boolean flag;
    private boolean active;
    private boolean cheese;

    public BuilderDesignPattern(String name, String address, boolean flag, boolean active, boolean cheese) {
        this.name = name;
        this.address = address;
        this.flag = flag;
        this.active = active;
        this.cheese = cheese;
    }

    public static class StaticBuilder{
        private String name;
        private String address;
        private boolean flag;
        private boolean active;
        private boolean cheese;

        public StaticBuilder(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public StaticBuilder addFlag(boolean flag) {
            this.flag = true;
            return this;
        }

        public StaticBuilder addActive() {
            this.active = true;
            return this;
        }

        public StaticBuilder addChesse(){
            this.cheese=true;
            return this;
        }
    }
}

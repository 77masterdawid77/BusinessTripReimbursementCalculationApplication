package org.example;

public class User {

    String name;
    String password;
    Boolean Admin;

    public String getName(){ return name;}
    public String getPassword(){ return password;}
    public Boolean getAdmin(){ return Admin;}

    public void setName(String name){ this.name = name;}
    public void setPassword(String password){ this.password = password;}
    public void setAdmin(Boolean admin){ this.Admin = admin;}

    public static class Builder {

        private String name;
        private String password;
        private Boolean Admin;

        public Builder() {
        }

        Builder(String name, String password, Boolean Admin) {
            this.name = name;
            this.password = password;
            this.Admin = Admin;
        }

        public Builder name(String name){
            this.name = name;
            return Builder.this;
        }

        public Builder password(String password){
            this.password = password;
            return Builder.this;
        }

        public Builder Admin(Boolean Admin){
            this.Admin = Admin;
            return Builder.this;
        }

        public User build() {
            if(this.name == null){
                throw new NullPointerException("The property \"name\" is null. "
                        + "Please set the value by \"name()\". "
                        + "The properties \"name\", \"password\" and \"Admin\" are required.");
            }
            if(this.password == null){
                throw new NullPointerException("The property \"password\" is null. "
                        + "Please set the value by \"password()\". "
                        + "The properties \"name\", \"password\" and \"Admin\" are required.");
            }
            if(this.Admin == null){
                throw new NullPointerException("The property \"Admin\" is null. "
                        + "Please set the value by \"Admin()\". "
                        + "The properties \"name\", \"password\" and \"Admin\" are required.");
            }

            return new User(this);
        }
    }

    User(Builder builder) {
        this.name = builder.name;
        this.password = builder.password;
        this.Admin = builder.Admin;
    }

    public void doSomething() {
        // do something
    }
}

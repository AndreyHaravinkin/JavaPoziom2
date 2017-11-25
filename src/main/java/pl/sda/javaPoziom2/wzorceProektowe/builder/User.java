package pl.sda.javaPoziom2.wzorceProektowe.builder;

public class User {
    private String firstname;
    private String lastname;
    private String adress;
    private int age;
    private String phone;

    private User(UserBuilder userBuilder) {
        this.firstname = userBuilder.firstname;
        this.lastname = userBuilder.lastname;
        this.age = userBuilder.age;
        this.adress = userBuilder.adress;
        this.phone = userBuilder.phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAdress() {
        return adress;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    /*************************************/
    /*************************************/

    static class UserBuilder{
        private String firstname;
        private String lastname;
        private String adress;
        private int age;
        private String phone;

        public UserBuilder  (String firstname) {
            this.firstname = firstname;
        }

        public UserBuilder lastname(String lastname){
            this.lastname = lastname;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder adress(String adress){
            this.adress = adress;
            return this;
        }


        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}

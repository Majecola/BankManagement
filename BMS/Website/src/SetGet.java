public class SetGet {
    private String name, email, age;
    //private boolean is_registered;


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        if(this.name.equals("Mike")){
            return "Boss";
        }
        return this.name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        if( ! this.email.contains("@")){
            return "Invalid email";
        }
        if(! this.email.contains(".")){
            return "Invalid email";
        }
        return this.email;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getAge(){
        if (Integer.parseInt(this.age)<18){
            return "Minimum age is 18";
        }
        return age;
    }

}

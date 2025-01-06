package Day_f_seven.Reflection;
public class Person {
        private String name;
        private String address;
        private String job;
        private String  dept;
        public Person(String dept) {
            this.dept=dept;
        }
        public Person(String name,String address, String job)
        {
            this.name=name;
            this.address=address;
            this.job=job;
        }
        public void setName(String name) {
            this.name=name;
        }
        public void setAge(String address) {
            this.address=address;
        }
        public void setJob(String job) {
            this.job=job;
        }
        public void setDept(String dept) {
            this.dept=dept;
        }
        public String getName() {
            return name;
        }
        public String getAddress() {
            return address;
        }
        public String getJob() {
            return job;
        }
        public String getDept() {
            System.out.println(dept);
            return "";
        }
        public void getDetails()
        {
            System.out.println("Name:"+name);
            System.out.println("Address:"+address);
            System.out.println("Job:"+job);
        }
    }
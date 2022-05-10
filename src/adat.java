public class adat {

    public class User {

        private String name;
        private int birthYear;
        private String address;


        /*public User() {
            this("John Doe", 1987, "Baker Street 135");
        }
        public User(String name, int birthYear, String address) {
            this(name, birthYear, address);
        }*/

        public User(String name, int birthYear, String address) {
            this.name = name;
            this.birthYear = birthYear;
            this.address = address;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBirthYear() {
            return birthYear;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int ageIn(int year) {
            if (year < birthYear) {
                return 0;
            }
            return year - birthYear;
        }

    /*
    @Override
    public String toString() {
        return name;
    }
     */

        @Override
        public String toString() {
            return name + '(' + birthYear + ')';
        }
    }
}


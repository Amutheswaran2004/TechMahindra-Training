package bbb;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return age == user.age && name.equals(user.name);
    }
}

class SecondUser {
    private String name;
    private int age;

    public SecondUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        User user1 = new User("Alice", 25);
        User user2 = new User("Alice", 25);
        SecondUser secondUser1 = new SecondUser("Alice", 25);
        SecondUser secondUser2 = new SecondUser("Alice", 25);

        System.out.println("User1 toString: " + user1);
        System.out.println("User2 toString: " + user2);

        System.out.println("Are User1 and User2 equal? " + user1.equals(user2));

        System.out.println("SecondUser1 toString: " + secondUser1);
        System.out.println("SecondUser2 toString: " + secondUser2);

        System.out.println("Are SecondUser1 and SecondUser2 equal? " + secondUser1.equals(secondUser2));

        System.out.println("User1 hashCode: " + user1.hashCode());
        System.out.println("User2 hashCode: " + user2.hashCode());

        System.out.println("SecondUser1 hashCode: " + secondUser1.hashCode());
        System.out.println("SecondUser2 hashCode: " + secondUser2.hashCode());
    }
}

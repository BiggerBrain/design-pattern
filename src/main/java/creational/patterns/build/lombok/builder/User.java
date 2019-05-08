/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package creational.patterns.build.lombok.builder;

/**
 * @author lishixiong
 * @version 1.0: User.java, v 0.1 2019年05月06日 10:46 lishixiong Exp $
 * lombok内置builder模式的实现
 */
public class User {

    private String firstName;     // 必传参数
    private String lastName;      // 必传参数
    private int    age;              // 可选参数
    private String phone;         // 可选参数
    private String address;       // 可选参数

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder();
        User user = userBuilder
                .firstName("li")
                .lastName("shixiong")
                .age(20)
                .phone("123456789")
                .address("亚特兰蒂斯大陆")
                .build();

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int    age;
        private String phone;
        private String address;

        public UserBuilder() {

        }

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user = new User(this);
            if (user.getAge() > 120) {
                throw new IllegalStateException("Age out of range"); // 线程安全
            }
            return user;
        }
    }
}
package Entity;

public class Class {

    private String studCourse;

    private Class(Builder builder) {
        this.studCourse = builder.studCourse;
    }

    public String getStudCourse() {
        return studCourse;
    }

    @Override
    public String toString() {
        return "Class{" +
                "studCourse=" + studCourse +
                '}';
    }

    private static class Builder {

        private String studCourse;

        public Builder setStudCourse(String studCourse) {
            this.studCourse = studCourse;
            return this;
        }

        public Class Build() {
            return new Class(this);
        }

    }
}
package Entity;

public class Department {
    private String deptNum, deptName;

    private Department (Builder builder) {
        this.deptNum = builder.deptNum;
        this.deptName = builder.deptName;
    }

    public String getDeptNum() {
        return deptNum;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return "Department {" +
                "deptNum ='" + deptNum + '\'' +
                ", deptName ='" + deptName + '\'' +
                '}';
    }

    public static class Builder {
        private String deptNum, deptName;

        public Builder setDeptNum(String deptNum) {
            this.deptNum = deptNum;
            return this;
        }

        public Builder setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }

        public Department Build(){
            return new Department(this);
        }
    }
}

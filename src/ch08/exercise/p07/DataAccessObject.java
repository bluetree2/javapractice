package ch08.exercise.p07;

public interface DataAccessObject {
    public void select();

    public void insert();

    public void update();

    public void delete();
}

class OracleDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("OracleDB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("OracleDB에 삽입");
    }

    @Override
    public void update() {
        System.out.println("OracleDB를 수정");
    }

    @Override
    public void delete() {
        System.out.println("OracleDB에서 삭제");
    }
}

class MySqlDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("MySqlDB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("MySqlDB에 삽입");
    }

    @Override
    public void update() {
        System.out.println("MySqlDB를 수정");
    }

    @Override
    public void delete() {
        System.out.println("MySqlDB에서 삭제");
    }
}

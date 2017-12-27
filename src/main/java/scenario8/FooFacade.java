package scenario8;

public class FooFacade{
    private FooDAOInterface fooDAO;

    public String fun() {
        return getFooDAO().fun();
    }

    public FooDAOInterface getFooDAO() {
        if (fooDAO == null) {
            fooDAO = new FooDAO();
        }

        return fooDAO;
    }

    public void setFooDAO(FooDAOInterface fooDAO) {
        this.fooDAO = fooDAO;
    }
}

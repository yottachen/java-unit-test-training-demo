package scenario8;

public class FooFacade{
    private FooDAO fooDAO;

    public FooFacade(FooDAO fooDAO) {
        this.fooDAO = fooDAO;
    }

    public String fun() {
        return fooDAO.fun();
    }
}

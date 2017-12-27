package scenario8;

public class FooDAO extends FrmBaseDAO implements FooDAOInterface {

    private FrmBaseDAO frmBaseDAO = new FrmBaseDAO();

    @Override
    public String fun() {
        return "fun";
    }
}

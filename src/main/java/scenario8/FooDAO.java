package scenario8;

public class FooDAO {

    private FrmBaseDAO frmBaseDAO;

    public FooDAO(FrmBaseDAO frmBaseDAO) {
        this.frmBaseDAO = frmBaseDAO;
    }

    public String fun() {
        return "fun";
    }
}

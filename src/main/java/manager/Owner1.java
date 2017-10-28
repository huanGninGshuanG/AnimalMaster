package manager;
import java.util.ArrayList;

public class Owner1 extends Manager{
    private ArrayList<ManagerWorkFlow> work_flow = new ArrayList<ManagerWorkFlow>();

    public Owner1(String name)
    {
        super(name);
    }
    @Override
    public void manage_work(ArrayList<ManagerWorkFlow> s)
    {
        this.work_flow = s;
    }

    @Override
    public void custom_work()
    {
        for(ManagerWorkFlow a : work_flow)
        {
            a.wrap(this);
        }
    }
}

package headfirst.dp.simuduck;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println(	"Silence." );
	}

}

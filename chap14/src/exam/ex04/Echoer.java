package exam.ex04;

public class Echoer extends Thread {
	public String msg;
	public Echo echo = new Echo();

	public Echoer(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		// 비동기화
//		echo.echo(msg);

		// 동기화
		synchronized (echo) {
			echo.echo(msg);
		}
	}
}

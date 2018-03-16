public class Television {
	int channel; // 채널
	int volume; // 볼륨
	boolean onOff; // 전원
	int uhdtv;
	int hdtv;

	void print() {
		System.out.println("채널은" + channel + "이고 볼륨은" + volume + "입니다.");
	}

	int getChannel() {
		return channel;
	}
}

public class Control {
	public static void main(String[] args) {
		LightBulb lightBulb = new LightBulb() ;
		ElectricPowerSwitch bulbSwitch = new ElectricPowerSwitch( lightBulb ) ;
		
		bulbSwitch.press() ;
		bulbSwitch.press() ;
	}
}

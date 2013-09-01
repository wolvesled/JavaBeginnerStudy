// Module 5 Mastery Check No.7
// modify Encode class to use a 8-char string as key.
class EncodeString {
	public static void main(String args[]) {
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		String key = "LacIpHEr";

		System.out.print("Original message: ");
		System.out.println(msg);

		// encode the message
		for(int i=0; i < msg.length(); i++)
			encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(i % 8));

		System.out.print("Encoded message: ");
		System.out.println(encmsg);

		// decode the message
		for(int i=0; i < msg.length(); i++)
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(i % 8));

		System.out.print("Decoded message: ");
		System.out.println(decmsg);
	}
}

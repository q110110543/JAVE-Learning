package BASE64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
	Encoder encoder = Base64.getEncoder();
	Decoder decoder = Base64.getDecoder();
	String text = "С�ܿ���";
	byte[] textByte = text.getBytes("UTF-8");
	
	
	String encodeToString = encoder.encodeToString(textByte);
	System.out.println(encodeToString);
	byte[] b = {98,97,3,4,4,5,5,66,};
	System.out.println(new String(decoder.decode(encodeToString),"UTF-8"));//ֱ��new String �������ʽ,����ָ��ת���ʽ
	System.out.println(new String(b,"UTF-8"));
	
	
	
	}

}



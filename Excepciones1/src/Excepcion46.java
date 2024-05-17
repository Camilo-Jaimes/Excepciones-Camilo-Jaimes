import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Excepcion46 {
static String INITIALIZATION_VECTOR = "AODVNUASDNVVAOVF";

    public static byte[] encrypt(String plainText, String encryptionKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
        SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(INITIALIZATION_VECTOR.getBytes("UTF-8")));
        return cipher.doFinal(plainText.getBytes("UTF-8"));
    }

    public static String decrypt(byte[] cipherText, String encryptionKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
        SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(INITIALIZATION_VECTOR.getBytes("UTF-8")));
        return new String(cipher.doFinal(cipherText), "UTF-8");
    }

    public static void main(String[] args) {
        try {
            String plainText = "Java Code Geeks Rock!";
            String encryptionKey = "MySecretKey123456"; // Cambia esto a tu clave de cifrado

            byte[] encryptedText = encrypt(plainText, encryptionKey);
            System.out.println("Texto cifrado: " + new String(encryptedText, "UTF-8"));

            String decryptedText = decrypt(encryptedText, encryptionKey);
            System.out.println("Texto descifrado: " + decryptedText);
        } catch (Exception e) {
            System.err.println("Error al cifrar o descifrar: " + e.getMessage());
        }
    }
}

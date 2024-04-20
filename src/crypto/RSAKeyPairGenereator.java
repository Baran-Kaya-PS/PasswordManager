package crypto;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class RSAKeyPairGenereator extends KeyPairGenerator {
    public RSAKeyPairGenereator(){
        super("RSA");
    }
}

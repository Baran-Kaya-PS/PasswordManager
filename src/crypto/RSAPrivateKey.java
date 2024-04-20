package crypto;

import java.security.PrivateKey;

public class RSAPrivateKey implements PrivateKey {
    @Override
    public String getAlgorithm() {
        return "RSA"; // TODO Implement RSA Algorithm
    }

    @Override
    public String getFormat() {
        return "PKCS#8";
    }

    @Override
    public byte[] getEncoded() {
        return new byte[0];
    }
}

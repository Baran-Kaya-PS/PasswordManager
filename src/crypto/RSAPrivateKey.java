package crypto;

import java.security.PrivateKey;

public class RSAPrivateKey implements PrivateKey {
    @Override
    public String getAlgorithm() {
        return "";
    }

    @Override
    public String getFormat() {
        return "";
    }

    @Override
    public byte[] getEncoded() {
        return new byte[0];
    }
}

package crypto;

import java.math.BigInteger;
import java.security.KeyPair;

public class RSAKeyPairGenereator {
    public RSAKeyPairGenereator(){}
    public BigInteger generatePrimeNumbers(){
        // (2 ^ 32) ^ Integer.MAX_VALUE
        return new BigInteger("1");
    }
    public BigInteger computeModulus(){
        return new BigInteger("1");
    }
    public BigInteger computeEulerTotient(){
        return new BigInteger("1");
    }
    public BigInteger calculatePrivateExponent(){
        return new BigInteger("1");
    }
    public BigInteger calculatePublicExponent(){
        return new BigInteger("1");
    }
    public KeyPair generateKeyPair(){
        return null;
    }
}

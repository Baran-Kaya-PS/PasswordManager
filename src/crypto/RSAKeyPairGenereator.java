package crypto;

import crypto.utils.Pair;

import java.math.BigInteger;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;

public class RSAKeyPairGenereator extends KeyPairGenerator {
    public RSAKeyPairGenereator(int keysize){
        super("RSA");
    }
    @Override
    public void initialize(int keysize, SecureRandom random) {
        if (keysize < 2048){
            throw new InvalidParameterException("key size must be greater than 2048");
        }
        super.initialize(keysize,random);
    }
    public Pair<BigInteger,BigInteger> generatePrimeNumbers(int keysize, SecureRandom random){
        BigInteger p = BigInteger.probablePrime(keysize/2, random);
        BigInteger q = BigInteger.probablePrime(keysize/2, random);
        return new Pair<BigInteger,BigInteger>(p, q);
    }
}

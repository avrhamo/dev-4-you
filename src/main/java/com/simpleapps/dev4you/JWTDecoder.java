package com.simpleapps.dev4you;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

public class JWTDecoder {
//    public static void main(String[] args) {
//        String jwtString =
//        "ZXlKaGJHY2lPaUpJVXpJMU5pSjk=.eyJVc2VyIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTcxMTY1NDQ0OCwiaWF0IjoxNzExNjU0NDQ4fQ.vQHFIn2jxRKQmZonl7kgQxUjqMWhYT75T206XGcdQwU";
//        String secretKey = "6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b";
//
//        // Parse the JWT
//        Jws<Claims> jws = Jwts.parserBuilder()
//                .setSigningKey(secretKey.getBytes())
//                .build()
//                .parseClaimsJws(jwtString);
//
//        // Print out JWT header, body, and signature for debugging
//        System.out.println("Header: " + jws.getHeader());
//        System.out.println("Body: " + jws.getBody());
//        System.out.println("Signature: " + jws.getSignature());
//
//        // Get the claims/payload
//        Claims claims = jws.getBody();
//
//        // Access specific claim values
//        String username = claims.getSubject();
//
//        // Print out the claims
//        System.out.println("Username: " + username);
//    }
}

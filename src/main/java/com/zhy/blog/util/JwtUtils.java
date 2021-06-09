package com.zhy.blog.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
@PropertySource(value = {"classpath:application.properties"})
public class JwtUtils {
    private String secret = "f4e2e52034348f86b67cde581c0f9eb5";
    private long expire = 604800;
    private String header = "token";
    /**
     * 生成jwt token
     */
    public String generateToken(long user_id) {
    Date nowDate = new Date();
    Date expireDate = new Date(nowDate.getTime()+expire*1000);
    return Jwts.builder()
            .setHeaderParam("typ","JWT")
            .setSubject(user_id+"")
            .setIssuedAt(nowDate)
            .setExpiration(expireDate)
            .signWith(SignatureAlgorithm.HS512,secret)
            .compact();
    }
    // 获取jwt的信息
    public Claims getClaimByToken(String token) {
    try {
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();
    }catch (Exception e){
        log.debug("validate is token error",e);
        return null;
    }
    }
    /**
     * token是否过期
     * @return  true：过期
     */
    public boolean isTokenExpired(Date expiration) {
        return expiration.before(new Date());
    }
}

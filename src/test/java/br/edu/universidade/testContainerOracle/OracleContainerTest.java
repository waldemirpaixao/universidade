package br.edu.universidade.testContainerOracle;

import java.time.Duration;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import org.testcontainers.containers.OracleContainer;

import java.util.Map;



public class OracleContainerTest implements QuarkusTestResourceLifecycleManager {
    private OracleContainer oracle =  new OracleContainer("gvenzl/oracle-xe:21-slim-faststart") .withStartupTimeout(Duration.ofMinutes(10));//new OracleContainer("gvenzl/oracle-xe:21-slim");
   

    @Override
    public Map<String, String> start() {
        oracle.start();
         String jdbcUrl = oracle.getJdbcUrl().replace(":ORCLCDB", "/XEPDB1");
        return Map.of(
            "quarkus.datasource.jdbc.url", jdbcUrl,
            "quarkus.datasource.username", oracle.getUsername(),
            "quarkus.datasource.password", oracle.getPassword(),
            "quarkus.datasource.db-kind", "oracle",
            "quarkus.hibernate-orm.dialect", "org.hibernate.dialect.OracleDialect"
        );
    }

    @Override
    public void stop() {
        oracle.stop();
    }
}
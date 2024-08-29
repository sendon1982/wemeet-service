package org.wemeet.service.config;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.RenderNameStyle;
import org.jooq.conf.RenderQuotedNames;
import org.jooq.conf.Settings;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jooq.ExceptionTranslatorExecuteListener;
import org.springframework.boot.autoconfigure.jooq.JooqExceptionTranslator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@Configuration
public class JooqConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public DataSourceConnectionProvider connectionProvider() {
        return new DataSourceConnectionProvider(
                new TransactionAwareDataSourceProxy(dataSource));
    }

    @Bean
    public DSLContext dsl() {
        return new DefaultDSLContext(configuration());
    }

    public DefaultConfiguration configuration() {
        DefaultConfiguration config = new DefaultConfiguration();
        config.set(connectionProvider());
        config.set(SQLDialect.MYSQL);
        config.set(new Settings().withRenderQuotedNames(RenderQuotedNames.EXPLICIT_DEFAULT_QUOTED));
        config.set(new DefaultExecuteListenerProvider(ExceptionTranslatorExecuteListener.DEFAULT));

        return config;
    }
}
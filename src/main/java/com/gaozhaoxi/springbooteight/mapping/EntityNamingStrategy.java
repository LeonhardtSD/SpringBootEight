package com.gaozhaoxi.springbooteight.mapping;

import org.hibernate.cfg.DefaultNamingStrategy;

/**
 * @author Leon
 */
public class EntityNamingStrategy extends DefaultNamingStrategy {
    @Override
    public String propertyToColumnName(String propertyName){
        String column=propertyName.replaceAll("\\.","_");
        return column;
    }

}

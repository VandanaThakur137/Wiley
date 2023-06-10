package com.wiley.springcore.factoryBeans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

//@RunWith(SpringJUnit4ClassRunner.class)
@Configuration("com/wiley/springcore/factoryBeans/config.xml")
public class InstanceBarFactoryIntegrationTest {

    @Autowired
    private Bar instance;
    
    @Test
    public void givenValidInstanceFactoryConfig_whenCreateInstance_thenNameIsCorrect() {
        assertNotNull(instance);
        assertEquals("someName", instance.getName());
    }
}

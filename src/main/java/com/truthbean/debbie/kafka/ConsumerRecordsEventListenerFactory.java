/**
 * Copyright (c) 2020 TruthBean(Rogar·Q)
 * Debbie is licensed under Mulan PSL v2.
 * You can use this software according to the terms and conditions of the Mulan PSL v2.
 * You may obtain a copy of Mulan PSL v2 at:
 * http://license.coscl.org.cn/MulanPSL2
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT, MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PSL v2 for more details.
 */
package com.truthbean.debbie.kafka;

import com.truthbean.debbie.bean.BeanFactory;
import com.truthbean.debbie.bean.GlobalBeanFactory;

/**
 * @author TruthBean/Rogar·Q
 * @since 0.1.0
 * Created on 2020-09-28 18:07
 */
public class ConsumerRecordsEventListenerFactory<K, V> implements BeanFactory<ConsumerRecordsEventListener<K, V>> {
    private final ConsumerRecordsEventListener<K, V> eventListener;

    public ConsumerRecordsEventListenerFactory() {
        this.eventListener = new ConsumerRecordsEventListener<>();
    }

    @Override
    public ConsumerRecordsEventListener<K, V> getBean() {
        return eventListener;
    }

    @Override
    public ConsumerRecordsEventListener<K, V> factoryBean() {
        return eventListener;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class<ConsumerRecordsEventListener> getBeanType() {
        return ConsumerRecordsEventListener.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void destroy() {

    }

    @Override
    public void setGlobalBeanFactory(GlobalBeanFactory globalBeanFactory) {

    }
}

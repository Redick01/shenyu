/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.admin.model.vo;

import org.apache.shenyu.admin.model.dto.DiscoveryDTO;
import org.apache.shenyu.admin.model.dto.DiscoveryUpstreamDTO;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * this is proxy selector view to web front.
 */
public class ProxySelectorVO implements Serializable {

    private static final long serialVersionUID = -1329374830009912963L;

    /**
     * proxy selector id.
     */
    private String id;

    /**
     * proxy selector name.
     */
    private String name;

    /**
     * forward port.
     */
    private Integer forwardPort;

    /**
     * type.
     */
    private String type;

    /**
     * listener node.
     */
    private String listenerNode;

    /**
     * handler.
     */
    private String handler;

    /**
     * createTime.
     */

    private Timestamp createTime;

    /**
     * updateTime
     */
    private Timestamp updateTime;

    /**
     * props.
     */
    private String props;


    /**
     * discovery.
     */
    private DiscoveryDTO discovery;

    /**
     * discovery upstream list.
     */
    private List<DiscoveryUpstreamDTO> discoveryUpstreams;

    /**
     * ProxySelectorVO.
     */
    public ProxySelectorVO() {

    }

    /**
     * ProxySelectorVO
     * @param name name of the proxy
     * @param forwardPort forward port
     * @param type type of the proxy
     * @param listenerNode listener
     * @param handler handler
     * @param discovery discovery
     * @param discoveryUpstreams discoveryUpstreams
     * @param props props
     */
    public ProxySelectorVO(final String id, final String name, final Integer forwardPort, final String type, final String listenerNode,
                           final String handler, final Timestamp createTime, final Timestamp updateTime, final DiscoveryDTO discovery,
                           final List<DiscoveryUpstreamDTO> discoveryUpstreams, final String props) {
        this.id = id;
        this.name = name;
        this.forwardPort = forwardPort;
        this.type = type;
        this.listenerNode = listenerNode;
        this.handler = handler;
        this.discovery = discovery;
        this.discoveryUpstreams = discoveryUpstreams;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.props = props;
    }

    /**
     * getId.
     *
     * @return name
     */
    public String getId() {
        return id;
    }

    /**
     * setId.
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get type.
     *
     * @return type of selector
     */
    public String getType() {
        return type;
    }

    /**
     * set type of selector.
     *
     * @param type type of selector
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * getName.
     *
     * @return name
     */
    public String getName() {

        return name;
    }

    /**
     * setName.
     *
     * @param name name
     */
    public void setName(final String name) {

        this.name = name;
    }

    /**
     * getForwardPort.
     *
     * @return forwardPort
     */
    public Integer getForwardPort() {

        return forwardPort;
    }

    /**
     * setForwardPort.
     *
     * @param forwardPort forwardPort
     */
    public void setForwardPort(final Integer forwardPort) {

        this.forwardPort = forwardPort;
    }

    /**
     * get listener node.
     * @return listener node
     */
    public String getListenerNode() {
        return listenerNode;
    }

    /**
     * set listener node.
     * @param listenerNode listener node
     */
    public void setListenerNode(String listenerNode) {
        this.listenerNode = listenerNode;
    }

    /**
     * get handler.
     * @return handler
     */
    public String getHandler() {
        return handler;
    }

    /**
     * set handler.
     * @param handler handler
     */
    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * set createTime.
     * @param createTime createTime
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * get createTime.
     * @return createTime
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * set updateTime.
     * @param updateTime updateTime
     */


    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get updateTime.
     * @return updateTime
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * get props.
     *
     * @return props
     */
    public String getProps() {
        return props;
    }

    /**
     * set props.
     *
     * @param props props
     */
    public void setProps(String props) {
        this.props = props;
    }

    /**
     * get discovery.
     * @return discovery
     */
    public DiscoveryDTO getDiscovery() {
        return discovery;
    }

    /**
     * set discovery.
     * @param discovery discovery
     */
    public void setDiscovery(DiscoveryDTO discovery) {
        this.discovery = discovery;
    }

    /**
     * get discovery upstream list.
     * @return upstream list
     */
    public List<DiscoveryUpstreamDTO> getDiscoveryUpstreams() {
        return discoveryUpstreams;
    }

    /**
     * set discovery upstream list.
     * @param discoveryUpstreams discovery upstream list
     */
    public void setDiscoveryUpstreams(List<DiscoveryUpstreamDTO> discoveryUpstreams) {
        this.discoveryUpstreams = discoveryUpstreams;
    }
}

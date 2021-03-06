/**
 * Copyright (c) 2013 SAP
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the SAP nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL SAP BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.15 at 01:57:20 PM MESZ 
//


package org.sopeco.engine.model.xmlentities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	
	
    public final static QName SCENARIO_QNAME = new QName("http://www.sopeco.org/SoPeCoScenarioDefinitionSchema", "scenario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XExperimentSeriesDefinition.ExperimentSeriesPreparation }
     * 
     */
    public XExperimentSeriesDefinition.ExperimentSeriesPreparation createExperimentSeriesDefinitionExperimentSeriesPreparation() {
        return new XExperimentSeriesDefinition.ExperimentSeriesPreparation();
    }

    /**
     * Create an instance of {@link XScenarioDefinition }
     * 
     */
    public XScenarioDefinition createScenarioDefinition() {
        return new XScenarioDefinition();
    }

    /**
     * Create an instance of {@link XExtensibleElement }
     * 
     */
    public XExtensibleElement createExtensibleElement() {
        return new XExtensibleElement();
    }

    /**
     * Create an instance of {@link XConstantValueAssignment }
     * 
     */
    public XConstantValueAssignment createConstantValueAssignment() {
        return new XConstantValueAssignment();
    }

    /**
     * Create an instance of {@link XConfigurationNode }
     * 
     */
    public XConfigurationNode createConfigurationNode() {
        return new XConfigurationNode();
    }

    /**
     * Create an instance of {@link XExplorationStrategy }
     * 
     */
    public XExplorationStrategy createExplorationStrategy() {
        return new XExplorationStrategy();
    }

    /**
     * Create an instance of {@link XDynamicValueAssignment }
     * 
     */
    public XDynamicValueAssignment createDynamicValueAssignment() {
        return new XDynamicValueAssignment();
    }

    /**
     * Create an instance of {@link XAnalysisConfiguration }
     * 
     */
    public XAnalysisConfiguration createAnalysisConfiguration() {
        return new XAnalysisConfiguration();
    }

    /**
     * Create an instance of {@link XMeasurementSpecification }
     * 
     */
    public XMeasurementSpecification createMeasurementSpecification() {
        return new XMeasurementSpecification();
    }

    /**
     * Create an instance of {@link XExperimentSeriesDefinition.ExperimentSeriesExecution }
     * 
     */
    public XExperimentSeriesDefinition.ExperimentSeriesExecution createExperimentSeriesDefinitionExperimentSeriesExecution() {
        return new XExperimentSeriesDefinition.ExperimentSeriesExecution();
    }

    /**
     * Create an instance of {@link XExperimentSeriesDefinition }
     * 
     */
    public XExperimentSeriesDefinition createExperimentSeriesDefinition() {
        return new XExperimentSeriesDefinition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XScenarioDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sopeco.org/SoPeCoScenarioDefinitionSchema", name = "scenario")
    public JAXBElement<XScenarioDefinition> createScenario(XScenarioDefinition value) {
        return new JAXBElement<XScenarioDefinition>(SCENARIO_QNAME, XScenarioDefinition.class, null, value);
    }

}

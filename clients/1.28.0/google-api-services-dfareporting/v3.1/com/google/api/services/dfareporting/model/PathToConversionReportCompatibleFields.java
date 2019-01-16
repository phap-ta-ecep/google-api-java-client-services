/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dfareporting.model;

/**
 * Represents fields that are compatible to be selected for a report of type "PATH_TO_CONVERSION".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PathToConversionReportCompatibleFields extends com.google.api.client.json.GenericJson {

  /**
   * Conversion dimensions which are compatible to be selected in the "conversionDimensions" section
   * of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dimension> conversionDimensions;

  static {
    // hack to force ProGuard to consider Dimension used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Dimension.class);
  }

  /**
   * Custom floodlight variables which are compatible to be selected in the
   * "customFloodlightVariables" section of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dimension> customFloodlightVariables;

  static {
    // hack to force ProGuard to consider Dimension used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Dimension.class);
  }

  /**
   * The kind of resource this is, in this case dfareporting#pathToConversionReportCompatibleFields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Metrics which are compatible to be selected in the "metricNames" section of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Metric> metrics;

  static {
    // hack to force ProGuard to consider Metric used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Metric.class);
  }

  /**
   * Per-interaction dimensions which are compatible to be selected in the
   * "perInteractionDimensions" section of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dimension> perInteractionDimensions;

  static {
    // hack to force ProGuard to consider Dimension used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Dimension.class);
  }

  /**
   * Conversion dimensions which are compatible to be selected in the "conversionDimensions" section
   * of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Dimension> getConversionDimensions() {
    return conversionDimensions;
  }

  /**
   * Conversion dimensions which are compatible to be selected in the "conversionDimensions" section
   * of the report.
   * @param conversionDimensions conversionDimensions or {@code null} for none
   */
  public PathToConversionReportCompatibleFields setConversionDimensions(java.util.List<Dimension> conversionDimensions) {
    this.conversionDimensions = conversionDimensions;
    return this;
  }

  /**
   * Custom floodlight variables which are compatible to be selected in the
   * "customFloodlightVariables" section of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Dimension> getCustomFloodlightVariables() {
    return customFloodlightVariables;
  }

  /**
   * Custom floodlight variables which are compatible to be selected in the
   * "customFloodlightVariables" section of the report.
   * @param customFloodlightVariables customFloodlightVariables or {@code null} for none
   */
  public PathToConversionReportCompatibleFields setCustomFloodlightVariables(java.util.List<Dimension> customFloodlightVariables) {
    this.customFloodlightVariables = customFloodlightVariables;
    return this;
  }

  /**
   * The kind of resource this is, in this case dfareporting#pathToConversionReportCompatibleFields.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of resource this is, in this case dfareporting#pathToConversionReportCompatibleFields.
   * @param kind kind or {@code null} for none
   */
  public PathToConversionReportCompatibleFields setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Metrics which are compatible to be selected in the "metricNames" section of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Metric> getMetrics() {
    return metrics;
  }

  /**
   * Metrics which are compatible to be selected in the "metricNames" section of the report.
   * @param metrics metrics or {@code null} for none
   */
  public PathToConversionReportCompatibleFields setMetrics(java.util.List<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Per-interaction dimensions which are compatible to be selected in the
   * "perInteractionDimensions" section of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Dimension> getPerInteractionDimensions() {
    return perInteractionDimensions;
  }

  /**
   * Per-interaction dimensions which are compatible to be selected in the
   * "perInteractionDimensions" section of the report.
   * @param perInteractionDimensions perInteractionDimensions or {@code null} for none
   */
  public PathToConversionReportCompatibleFields setPerInteractionDimensions(java.util.List<Dimension> perInteractionDimensions) {
    this.perInteractionDimensions = perInteractionDimensions;
    return this;
  }

  @Override
  public PathToConversionReportCompatibleFields set(String fieldName, Object value) {
    return (PathToConversionReportCompatibleFields) super.set(fieldName, value);
  }

  @Override
  public PathToConversionReportCompatibleFields clone() {
    return (PathToConversionReportCompatibleFields) super.clone();
  }

}
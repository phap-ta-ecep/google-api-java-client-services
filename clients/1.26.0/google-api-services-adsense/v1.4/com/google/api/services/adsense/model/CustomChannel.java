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

package com.google.api.services.adsense.model;

/**
 * Model definition for CustomChannel.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomChannel extends com.google.api.client.json.GenericJson {

  /**
   * Code of this custom channel, not necessarily unique across ad clients.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Unique identifier of this custom channel. This should be considered an opaque identifier; it is
   * not safe to rely on it being in any particular format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Kind of resource this is, in this case adsense#customChannel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of this custom channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The targeting information of this custom channel, if activated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetingInfo targetingInfo;

  /**
   * Code of this custom channel, not necessarily unique across ad clients.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Code of this custom channel, not necessarily unique across ad clients.
   * @param code code or {@code null} for none
   */
  public CustomChannel setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Unique identifier of this custom channel. This should be considered an opaque identifier; it is
   * not safe to rely on it being in any particular format.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique identifier of this custom channel. This should be considered an opaque identifier; it is
   * not safe to rely on it being in any particular format.
   * @param id id or {@code null} for none
   */
  public CustomChannel setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Kind of resource this is, in this case adsense#customChannel.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind of resource this is, in this case adsense#customChannel.
   * @param kind kind or {@code null} for none
   */
  public CustomChannel setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of this custom channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this custom channel.
   * @param name name or {@code null} for none
   */
  public CustomChannel setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The targeting information of this custom channel, if activated.
   * @return value or {@code null} for none
   */
  public TargetingInfo getTargetingInfo() {
    return targetingInfo;
  }

  /**
   * The targeting information of this custom channel, if activated.
   * @param targetingInfo targetingInfo or {@code null} for none
   */
  public CustomChannel setTargetingInfo(TargetingInfo targetingInfo) {
    this.targetingInfo = targetingInfo;
    return this;
  }

  @Override
  public CustomChannel set(String fieldName, Object value) {
    return (CustomChannel) super.set(fieldName, value);
  }

  @Override
  public CustomChannel clone() {
    return (CustomChannel) super.clone();
  }

  /**
   * The targeting information of this custom channel, if activated.
   */
  public static final class TargetingInfo extends com.google.api.client.json.GenericJson {

    /**
     * The name used to describe this channel externally.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String adsAppearOn;

    /**
     * The external description of the channel.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String description;

    /**
     * The locations in which ads appear. (Only valid for content and mobile content ads
     * (deprecated)). Acceptable values for content ads are: TOP_LEFT, TOP_CENTER, TOP_RIGHT,
     * MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT,
     * MULTIPLE_LOCATIONS. Acceptable values for mobile content ads (deprecated) are: TOP, MIDDLE,
     * BOTTOM, MULTIPLE_LOCATIONS.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String location;

    /**
     * The language of the sites ads will be displayed on.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String siteLanguage;

    /**
     * The name used to describe this channel externally.
     * @return value or {@code null} for none
     */
    public java.lang.String getAdsAppearOn() {
      return adsAppearOn;
    }

    /**
     * The name used to describe this channel externally.
     * @param adsAppearOn adsAppearOn or {@code null} for none
     */
    public TargetingInfo setAdsAppearOn(java.lang.String adsAppearOn) {
      this.adsAppearOn = adsAppearOn;
      return this;
    }

    /**
     * The external description of the channel.
     * @return value or {@code null} for none
     */
    public java.lang.String getDescription() {
      return description;
    }

    /**
     * The external description of the channel.
     * @param description description or {@code null} for none
     */
    public TargetingInfo setDescription(java.lang.String description) {
      this.description = description;
      return this;
    }

    /**
     * The locations in which ads appear. (Only valid for content and mobile content ads
     * (deprecated)). Acceptable values for content ads are: TOP_LEFT, TOP_CENTER, TOP_RIGHT,
     * MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT,
     * MULTIPLE_LOCATIONS. Acceptable values for mobile content ads (deprecated) are: TOP, MIDDLE,
     * BOTTOM, MULTIPLE_LOCATIONS.
     * @return value or {@code null} for none
     */
    public java.lang.String getLocation() {
      return location;
    }

    /**
     * The locations in which ads appear. (Only valid for content and mobile content ads
     * (deprecated)). Acceptable values for content ads are: TOP_LEFT, TOP_CENTER, TOP_RIGHT,
     * MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT,
     * MULTIPLE_LOCATIONS. Acceptable values for mobile content ads (deprecated) are: TOP, MIDDLE,
     * BOTTOM, MULTIPLE_LOCATIONS.
     * @param location location or {@code null} for none
     */
    public TargetingInfo setLocation(java.lang.String location) {
      this.location = location;
      return this;
    }

    /**
     * The language of the sites ads will be displayed on.
     * @return value or {@code null} for none
     */
    public java.lang.String getSiteLanguage() {
      return siteLanguage;
    }

    /**
     * The language of the sites ads will be displayed on.
     * @param siteLanguage siteLanguage or {@code null} for none
     */
    public TargetingInfo setSiteLanguage(java.lang.String siteLanguage) {
      this.siteLanguage = siteLanguage;
      return this;
    }

    @Override
    public TargetingInfo set(String fieldName, Object value) {
      return (TargetingInfo) super.set(fieldName, value);
    }

    @Override
    public TargetingInfo clone() {
      return (TargetingInfo) super.clone();
    }

  }
}
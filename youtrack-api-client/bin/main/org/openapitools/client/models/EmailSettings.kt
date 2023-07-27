/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.StorageEntry

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents email settings for this YouTrack installation.
 *
 * @param id 
 * @param isEnabled 
 * @param host 
 * @param port 
 * @param mailProtocol 
 * @param anonymous 
 * @param login 
 * @param sslKey 
 * @param from 
 * @param replyTo 
 * @param dollarType 
 */


interface EmailSettings {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "isEnabled")
    val isEnabled: kotlin.Boolean?
    @Json(name = "host")
    val host: kotlin.String?
    @Json(name = "port")
    val port: kotlin.Int?
    @Json(name = "mailProtocol")
    val mailProtocol: EmailSettings.MailProtocol?
    @Json(name = "anonymous")
    val anonymous: kotlin.Boolean?
    @Json(name = "login")
    val login: kotlin.String?
    @Json(name = "sslKey")
    val sslKey: StorageEntry?
    @Json(name = "from")
    val from: kotlin.String?
    @Json(name = "replyTo")
    val replyTo: kotlin.String?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
    /**
     * 
     *
     * Values: sMTP,sMTPS,sMTPTLS
     */
    @JsonClass(generateAdapter = false)
    enum class MailProtocol(val value: kotlin.String) {
        @Json(name = "SMTP") sMTP("SMTP"),
        @Json(name = "SMTPS") sMTPS("SMTPS"),
        @Json(name = "SMTP_TLS") sMTPTLS("SMTP_TLS");
    }
}


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

import org.openapitools.client.models.VersionBundle
import org.openapitools.client.models.VersionBundleElement

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param bundle 
 * @param defaultValues 
 */


data class VersionBundleCustomFieldDefaultsAllOf (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "bundle")
    val bundle: VersionBundle? = null,

    @Json(name = "defaultValues")
    val defaultValues: kotlin.collections.List<VersionBundleElement>? = null

)

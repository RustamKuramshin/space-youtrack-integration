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

import org.openapitools.client.models.BackupStatus
import org.openapitools.client.models.User

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents database backup settings of the YouTrack instance.
 *
 * @param id 
 * @param location 
 * @param filesToKeep 
 * @param cronExpression 
 * @param archiveFormat 
 * @param isOn 
 * @param availableDiskSpace 
 * @param notifiedUsers 
 * @param backupStatus 
 * @param dollarType 
 */


interface DatabaseBackupSettings {

    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "location")
    val location: kotlin.String?
    @Json(name = "filesToKeep")
    val filesToKeep: kotlin.Int?
    @Json(name = "cronExpression")
    val cronExpression: kotlin.String?
    @Json(name = "archiveFormat")
    val archiveFormat: DatabaseBackupSettings.ArchiveFormat?
    @Json(name = "isOn")
    val isOn: kotlin.Boolean?
    @Json(name = "availableDiskSpace")
    val availableDiskSpace: kotlin.Long?
    @Json(name = "notifiedUsers")
    val notifiedUsers: kotlin.collections.List<User>?
    @Json(name = "backupStatus")
    val backupStatus: BackupStatus?
    @Json(name = "\$type")
    val dollarType: kotlin.String?
    /**
     * 
     *
     * Values: tARGZ,zIP
     */
    @JsonClass(generateAdapter = false)
    enum class ArchiveFormat(val value: kotlin.String) {
        @Json(name = "TAR_GZ") tARGZ("TAR_GZ"),
        @Json(name = "ZIP") zIP("ZIP");
    }
}


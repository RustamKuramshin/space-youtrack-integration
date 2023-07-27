
# DatabaseBackupSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  |  [optional] [readonly]
**location** | **kotlin.String** |  |  [optional]
**filesToKeep** | **kotlin.Int** |  |  [optional]
**cronExpression** | **kotlin.String** |  |  [optional]
**archiveFormat** | [**inline**](#ArchiveFormat) |  |  [optional]
**isOn** | **kotlin.Boolean** |  |  [optional]
**availableDiskSpace** | **kotlin.Long** |  |  [optional] [readonly]
**notifiedUsers** | [**kotlin.collections.List&lt;User&gt;**](User.md) |  |  [optional]
**backupStatus** | [**BackupStatus**](BackupStatus.md) |  |  [optional]
**dollarType** | **kotlin.String** |  |  [optional] [readonly]


<a id="ArchiveFormat"></a>
## Enum: archiveFormat
Name | Value
---- | -----
archiveFormat | TAR_GZ, ZIP




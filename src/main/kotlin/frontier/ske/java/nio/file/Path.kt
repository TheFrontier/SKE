package frontier.ske.java.nio.file

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStream
import java.io.OutputStream
import java.nio.channels.SeekableByteChannel
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.*
import java.nio.file.attribute.FileAttribute
import kotlin.streams.asSequence

fun Path.newInputStream(vararg options: OpenOption) =
    Files.newInputStream(this, *options)

fun Path.newOutputStream(vararg options: OpenOption) =
    Files.newOutputStream(this, *options)

fun Path.newByteChannel(options: Set<OpenOption>, vararg attrs: FileAttribute<*>): SeekableByteChannel =
    Files.newByteChannel(this, options, *attrs)

fun Path.newByteChannel(vararg options: OpenOption): SeekableByteChannel =
    Files.newByteChannel(this, *options)

fun Path.newDirectoryStream(): DirectoryStream<Path> =
    Files.newDirectoryStream(this)

fun Path.newDirectoryStream(glob: String): DirectoryStream<Path> =
    Files.newDirectoryStream(this, glob)

fun Path.newDirectoryStream(filter: DirectoryStream.Filter<in Path>): DirectoryStream<Path> =
    Files.newDirectoryStream(this, filter)

fun Path.createFile(vararg attrs: FileAttribute<*>): Path =
    Files.createFile(this, *attrs)

fun Path.createDirectory(vararg attrs: FileAttribute<*>): Path =
    Files.createDirectory(this, *attrs)

fun Path.createDirectories(vararg attrs: FileAttribute<*>): Path =
    Files.createDirectories(this, *attrs)

fun Path.createTempFile(prefix: String, suffix: String, vararg attrs: FileAttribute<*>): Path =
    Files.createTempFile(this, prefix, suffix, *attrs)

fun Path.createTempDirectory(prefix: String, vararg attrs: FileAttribute<*>): Path =
    Files.createTempDirectory(this, prefix, *attrs)

fun Path.createSymbolicLink(target: Path, vararg attrs: FileAttribute<*>): Path =
    Files.createSymbolicLink(this, target, *attrs)

fun Path.createLink(existing: Path): Path =
    Files.createLink(this, existing)

fun Path.delete() =
    Files.delete(this)

fun Path.deleteIfExists() =
    Files.deleteIfExists(this)

fun Path.copy(target: Path, vararg options: CopyOption): Path =
    Files.copy(this, target, *options)

fun Path.move(target: Path, vararg options: CopyOption): Path =
    Files.move(this, target, *options)

fun Path.readSymbolicLink(): Path =
    Files.readSymbolicLink(this)

inline val Path.fileStore: FileStore
    get() = Files.getFileStore(this)

fun Path.isSamefile(other: Path): Boolean =
    Files.isSameFile(this, other)

inline val Path.isHidden: Boolean
    get() = Files.isHidden(this)

inline val Path.contentType: String
    get() = Files.probeContentType(this)

inline val Path.isSymbolicLink: Boolean
    get() = Files.isSymbolicLink(this)

inline val Path.isDirectory: Boolean
    get() = Files.isDirectory(this)

inline val Path.isFile: Boolean
    get() = Files.isRegularFile(this)

inline val Path.size: Long
    get() = Files.size(this)

inline val Path.exists: Boolean
    get() = Files.exists(this)

inline val Path.notExists: Boolean
    get() = Files.notExists(this)

inline val Path.isReadable: Boolean
    get() = Files.isReadable(this)

inline val Path.isWritable: Boolean
    get() = Files.isWritable(this)

inline val Path.isExecutable: Boolean
    get() = Files.isExecutable(this)

fun Path.newBufferedReader(cs: Charset = StandardCharsets.UTF_8): BufferedReader =
    Files.newBufferedReader(this, cs)

fun Path.newBufferedWriter(cs: Charset = StandardCharsets.UTF_8, vararg options: OpenOption): BufferedWriter =
    Files.newBufferedWriter(this, cs, *options)

fun InputStream.copy(target: Path, vararg options: CopyOption): Long =
    Files.copy(this, target, *options)

fun Path.copy(out: OutputStream): Long =
    Files.copy(this, out)

fun Path.readAllBytes(): ByteArray =
    Files.readAllBytes(this)

fun Path.readAllLines(cs: Charset = StandardCharsets.UTF_8): List<String> =
    Files.readAllLines(this, cs)

fun Path.write(bytes: ByteArray, vararg options: OpenOption): Path =
    Files.write(this, bytes, *options)

fun Path.write(lines: Iterable<CharSequence>, cs: Charset = StandardCharsets.UTF_8, vararg options: OpenOption): Path =
    Files.write(this, lines, cs, *options)

fun Path.list(): Sequence<Path> =
    Files.list(this).asSequence()

fun Path.lines(cs: Charset = StandardCharsets.UTF_8): Sequence<String> =
    Files.lines(this, cs).asSequence()
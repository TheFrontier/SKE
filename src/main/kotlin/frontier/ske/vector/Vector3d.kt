package frontier.ske.vector

import com.flowpowered.math.vector.Vector3d

fun Vector3d.joinToString(
    prefix: CharSequence = "",
    separator: CharSequence = ", ",
    postfix: CharSequence = ""
): String = StringBuilder()
    .append(prefix).append(x)
    .append(separator).append(y)
    .append(separator).append(z)
    .append(postfix).toString()
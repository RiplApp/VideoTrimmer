/*
 * MIT License
 *
 * Copyright (c) 2016 Knowledge, education for life.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.lb.video_trimmer_library.interfaces

import android.media.MediaPlayer
import android.net.Uri
import androidx.annotation.UiThread

interface VideoTrimmingListener {
    @UiThread
    fun onVideoPrepared(mp: MediaPlayer)

    @UiThread
    fun onTrimStarted()

    /**
     * @param uri the result, trimmed video, or null if failed
     */
    @UiThread
    fun onFinishedTrimming(uri: Uri?)

    /**
     * check {[android.media.MediaPlayer.OnErrorListener]}
     */
    @UiThread
    fun onErrorWhileViewingVideo(what: Int, extra: Int)
}

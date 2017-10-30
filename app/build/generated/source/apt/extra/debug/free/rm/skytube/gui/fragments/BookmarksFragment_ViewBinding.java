// Generated code from Butter Knife. Do not modify!
package free.rm.skytube.gui.fragments;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import free.rm.skytube.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BookmarksFragment_ViewBinding extends BaseVideosGridFragment_ViewBinding {
  private BookmarksFragment target;

  @UiThread
  public BookmarksFragment_ViewBinding(BookmarksFragment target, View source) {
    super(target, source);

    this.target = target;

    target.noBookmarkedVideosText = Utils.findRequiredView(source, R.id.noBookmarkedVideosText, "field 'noBookmarkedVideosText'");
  }

  @Override
  public void unbind() {
    BookmarksFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.noBookmarkedVideosText = null;

    super.unbind();
  }
}

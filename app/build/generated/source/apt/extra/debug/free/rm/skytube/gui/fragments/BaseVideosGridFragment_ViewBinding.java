// Generated code from Butter Knife. Do not modify!
package free.rm.skytube.gui.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import free.rm.skytube.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseVideosGridFragment_ViewBinding implements Unbinder {
  private BaseVideosGridFragment target;

  @UiThread
  public BaseVideosGridFragment_ViewBinding(BaseVideosGridFragment target, View source) {
    this.target = target;

    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BaseVideosGridFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.swipeRefreshLayout = null;
  }
}

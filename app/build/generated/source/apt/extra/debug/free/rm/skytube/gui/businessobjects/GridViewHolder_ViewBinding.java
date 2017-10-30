// Generated code from Butter Knife. Do not modify!
package free.rm.skytube.gui.businessobjects;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import free.rm.skytube.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GridViewHolder_ViewBinding implements Unbinder {
  private GridViewHolder target;

  private View view2131689734;

  @UiThread
  public GridViewHolder_ViewBinding(final GridViewHolder target, View source) {
    this.target = target;

    View view;
    target.channelLayout = Utils.findRequiredView(source, R.id.channel_layout, "field 'channelLayout'");
    target.titleTextView = Utils.findRequiredViewAsType(source, R.id.title_text_view, "field 'titleTextView'", TextView.class);
    target.channelTextView = Utils.findRequiredViewAsType(source, R.id.channel_text_view, "field 'channelTextView'", TextView.class);
    target.thumbsUpPercentageTextView = Utils.findRequiredViewAsType(source, R.id.thumbs_up_text_view, "field 'thumbsUpPercentageTextView'", TextView.class);
    target.videoDurationTextView = Utils.findRequiredViewAsType(source, R.id.video_duration_text_view, "field 'videoDurationTextView'", TextView.class);
    target.publishDateTextView = Utils.findRequiredViewAsType(source, R.id.publish_date_text_view, "field 'publishDateTextView'", TextView.class);
    target.thumbnailImageView = Utils.findRequiredViewAsType(source, R.id.thumbnail_image_view, "field 'thumbnailImageView'", ImageView.class);
    target.viewsTextView = Utils.findRequiredViewAsType(source, R.id.views_text_view, "field 'viewsTextView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.options_button, "method 'onOptionsButtonClick'");
    view2131689734 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onOptionsButtonClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    GridViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.channelLayout = null;
    target.titleTextView = null;
    target.channelTextView = null;
    target.thumbsUpPercentageTextView = null;
    target.videoDurationTextView = null;
    target.publishDateTextView = null;
    target.thumbnailImageView = null;
    target.viewsTextView = null;

    view2131689734.setOnClickListener(null);
    view2131689734 = null;
  }
}

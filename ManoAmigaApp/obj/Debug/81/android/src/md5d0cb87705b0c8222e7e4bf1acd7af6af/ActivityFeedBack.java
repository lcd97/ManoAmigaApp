package md5d0cb87705b0c8222e7e4bf1acd7af6af;


public class ActivityFeedBack
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("ManoAmigaApp.ActivityFeedBack, ManoAmigaApp", ActivityFeedBack.class, __md_methods);
	}


	public ActivityFeedBack ()
	{
		super ();
		if (getClass () == ActivityFeedBack.class)
			mono.android.TypeManager.Activate ("ManoAmigaApp.ActivityFeedBack, ManoAmigaApp", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

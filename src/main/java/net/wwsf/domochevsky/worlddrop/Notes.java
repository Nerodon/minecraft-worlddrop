package net.wwsf.domochevsky.worlddrop;

public class Notes 
{
/*
b11
	- Updated to 1.9
	- Velocity should now be explicitly maintained as well. (As opposed to just assuming it was, like previous.)
	- Clearing a small 1x3 space on arrival now, if the blocks are common materials (like dirt, stone or netherrack). This should ensure that you don't suffocate immediately.

b12
	- Added a line to ensure that the mod is only required on server-side

b13
	- Fixed a crash, due to trying to access a client-only method on the server.

b14
- Fixed another client-side only issue for chat formatting.
- Did some minor adjustments, to be compatible with Forge build 1907.
- Added a config option to disable portal ignitions. (Disabled by default. If enabled portals cannot be created via fire, lightning, flint&steel etc.)

b15
- Updated to 1.10.*

b16
- Updated to 1.12.*

b17
- Removed color chat formatting, no longer working in 1.12.2 as is.
- Fixed chained teleports from occurring when more than one successive drop have a valid height for where the player is.
- Fixed Player taking massive continuous suffocation damage while the client was loading the dimension.
- Added small grace period to avoid quickly teleporting back and forth and also makes players invulnerable against damage for a short time.

 */
}

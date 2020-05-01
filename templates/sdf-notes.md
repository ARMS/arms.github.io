# Relevant SDF Entities
model (name, canonical_link)
+ static
+ self_collide
+ allow_auto_disable
+ include...
+ model:nested
+ enable_wind
+ frame (name, attached_to)
    * pose (relative_to)
+ pose (relative_to)
+ link (name)
    * gravity
    * enable_wind
    * self_collide
    * kinematic
    * must_be_base_link
    * velocity_decay...
    * pose (relative_to)
    * inertial
        - mass
        - inertia
            + ixx, ixy, ixz, iyy, iyz, izz
        - pose (relative_to)
    * collision (name)
        - laser_retro
        - max_contacts
        - pose (relative_to)
        - geometry
            + empty
            + box
                * size
            + cylinder
                * radius
                * length
            + heightmap...
            + image...
            + mesh
                * uri
                * submesh
                    - name
                    - center
                * scale
            + plane
                * normal
                * size
            + polyline
                * point
                * height
            + sphere
                * radius
        - surface...
    * visual (name)
        - cast_shadows
        - laser_retro
        - transparency
        - meta
            + layer
        - pose (relative_to)
        - material
            + script...
            + shader...
            + lighting
            + ambient
            + diffuse
            + specular
            + emissive
            + pbr...
        - geometry:same
        - plugin...
    * sensor (name, type)...
    * projector (name)
        - texture
        - fov
        - near_clip
        - far_clip
        - pose (relative_to)
        - plugin...
    * audio_sink
    * audio_source...
    * battery...
    * light
+ joint (name, type)
    * parent
    * child
    * gearbox_ratio
    * gearbox_reference_body
    * thread_pitch
    * axis...
    * axis2...
    * physics...
    * pose (relative_to)
    * sensor
+ plugin (name, filename)
+ gripper (name)...

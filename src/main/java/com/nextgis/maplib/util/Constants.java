/*
 * Project:  NextGIS Mobile
 * Purpose:  Mobile GIS for Android.
 * Author:   Dmitry Baryshnikov (aka Bishop), bishop.dev@gmail.com
 * *****************************************************************************
 * Copyright (c) 2012-2015. NextGIS, info@nextgis.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.nextgis.maplib.util;

import java.util.concurrent.TimeUnit;


public interface Constants
{
    public final static String TAG    = "nextgismobile";
    public static final int NOT_FOUND = -1;

    /**
     * HTTP parameters
     */
    public static final String APP_USER_AGENT     = "NextGIS Mobile";
    public static final int    TIMEOUT_CONNECTION = 1500;
    public static final int    TIMEOUT_SOKET      = 3000;
    public static final int    IO_BUFFER_SIZE     = 1024;

    /**
     * NGW account type
     */
    public static final String NGW_ACCOUNT_TYPE = "nextgis.com";

    /**
     * Map parameters
     */
    public static final float MIN_SCROLL_STEP = 5.5f;
    public static final int   MAP_LIMITS_NO   = 1; // no limits to scroll map
    public static final int   MAP_LIMITS_X    = 2; // limit to scroll map by x axis
    public static final int   MAP_LIMITS_Y    = 3; // limit to scroll map by y axis
    public static final int   MAP_LIMITS_XY   = 4; // limit to scroll map by x & y axis

    //the additional size to off screen drawing
    //from 1 and higher
    //As more than more memory needed
    public static final float OFFSCREEN_EXTRASIZE_RATIO = 1.5f;

    public static final String CONFIG               = "config.json";
    public static final String LAYER_PREFIX         = "layer_";
    public static final String TILE_EXT             = ".tile";
    public static final String MAP_EXT              = ".ngm";

    /**
     * JSON keys
     */
    public static final String JSON_NAME_KEY            = "name";
    public static final String JSON_VISIBILITY_KEY      = "visible";
    public static final String JSON_LEVELS_KEY          = "levels";
    public static final String JSON_LEVEL_KEY           = "level";
    public static final String JSON_TYPE_KEY            = "type";
    public static final String JSON_MAXX_KEY            = "maxx";
    public static final String JSON_MINX_KEY            = "minx";
    public static final String JSON_MAXY_KEY            = "maxy";
    public static final String JSON_MINY_KEY            = "miny";
    public static final String JSON_MAXLEVEL_KEY        = "max_level";
    public static final String JSON_MINLEVEL_KEY        = "min_level";
    public static final String JSON_LAYERS_KEY          = "layers";
    public static final String JSON_LAYER_KEY           = "layer";
    public static final String JSON_PATH_KEY            = "path";
    public static final String JSON_MAP_KEY             = "map";
    public static final String JSON_CONNECTION_ID_KEY   = "connection_id";
    public static final String JSON_LOGIN_KEY           = "login";
    public static final String JSON_PASSWORD_KEY        = "password";
    public static final String JSON_BBOX_KEY            = "bbox";
    public static final String JSON_BBOX_MINX_KEY       = "bbox_minx";
    public static final String JSON_BBOX_MINY_KEY       = "bbox_miny";
    public static final String JSON_BBOX_MAXX_KEY       = "bbox_maxx";
    public static final String JSON_BBOX_MAXY_KEY       = "bbox_maxy";
    public static final String JSON_FIELDS_KEY          = "fields";
    public static final String JSON_FIELD_NAME_KEY      = "field_name";
    public static final String JSON_FIELD_ALIAS_KEY     = "field_alias";
    public static final String JSON_FIELD_TYPE_KEY      = "field_type";
    public static final String JSON_GEOMETRY_TYPE_KEY   = "geometry_type";

    /**
     * Layer type
     */
    public static final int LAYERTYPE_REMOTE_TMS         = 1;

    /**
     * time constants
     */
    public static final long     ONE_SECOND                      = 1000;
    public static final long     ONE_MINUTE                      = ONE_SECOND * 60;
    public static final long     ONE_HOUR                        = ONE_MINUTE * 60;
    public static final long     ONE_DAY                         = ONE_HOUR * 24;
    public static final long     ONE_WEEK                        = ONE_DAY * 7;
    public static final long     DEFAULT_MAXIMUM_CACHED_FILE_AGE = ONE_WEEK;
    public static final long     ONE_YEAR                        = ONE_DAY * 365;
    public static final int      KEEP_ALIVE_TIME                 = 65;
    public static final TimeUnit KEEP_ALIVE_TIME_UNIT            = TimeUnit.SECONDS;
}
